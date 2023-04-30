def from_raw_values(cls, values):
	"""
	Create a Bookmarks object from a list of raw bookmark string values.
	
	You should not need to use this method unless you want to deserialize
	bookmarks.
	
	:param values: ASCII string values (raw bookmarks)
	:type values: Iterable[str]
	"""
	pass

  # region getters
  @property
  def description(self) -> Optional[Tuple[int, str]]:
    """
    The "description" property contains a tuple or None.
    
    This value should be a tuple (version, description) where version is
    the Bookmarks.version attribute and description is the Bookmarks.description
    attribute.
    
    If none of the bookmarked items are contained in this bookmarked list,
    then that item will not be included in the result.
    
    If the current Bookmarks.bookmarks type