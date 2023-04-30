import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MethodWriter{
	/** 
	 * Puts some abstract types of  {@link #currentFrame} in {@link #stackMapTableEntries} , using theJVMS verification_type_info format used in StackMapTable attributes.
	 * @param start index of the first type in {@link #currentFrame} to write.
	 * @param end index of last type in {@link #currentFrame} to write (exclusive).
	 */
	
	private void putAbstractTypes(final int start,final int end){
			for (int i=start;i<end;++i){	
				if (isSubtype(currentStackMapType.ordinal(),i)){
					AbstractType type= typeMap.get(i);
					if (type!=null){
						try{
							writer.writeObject( type );
							return;
						}catch (MethodWriter.Error e){
							if (LOGGER.isLoggable(Level.SEVERE)) {
								LOGGER.log(Level.WARNING,"Error: writing type " + type.qualifiedName() + " in " +