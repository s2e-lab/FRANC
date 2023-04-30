def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	return http.urlopen(url, http.get(url)).content_type()

#pragma once

#include "Scenes/Platformer/Components/Entities/Object/BellSolo.h"
