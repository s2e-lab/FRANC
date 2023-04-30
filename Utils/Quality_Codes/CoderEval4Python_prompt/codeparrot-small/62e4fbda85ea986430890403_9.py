def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
		return list(map(
			lambda s: s.strip(),
			seq[1:])
        )
# Licensed under a 3-clause BSD style license - see LICENSE.rst

