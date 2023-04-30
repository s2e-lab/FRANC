def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	
	
	out = []
	for i in range(1, len(seq)):
		out.append(seq[i])
	
	return out
#
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
