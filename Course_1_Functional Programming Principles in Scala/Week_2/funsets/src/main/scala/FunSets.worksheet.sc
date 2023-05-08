import funsets.FunSets.union
import funsets.FunSets.singletonSet
import funsets.FunSets.contains

val d = singletonSet(5)
val d1 = singletonSet(6)

val s = union(d1,d)

contains(s, 1)


