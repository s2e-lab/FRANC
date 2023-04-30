def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
		return [x if x in seq else '-' for x in seq]

	from django.http import HttpResponseRedirect