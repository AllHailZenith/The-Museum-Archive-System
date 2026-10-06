Phase 1
Overriding equals is important because the default Java equality checks whether two objects are the exact same reference in memory. For the museum system, two `Artifact` objects should be considered equal when they have the same ID, even if they are different objects. This allows us to create a search key with only an ID and still find the correct artifact.

The “swap with last” technique makes removal more efficient because it avoids shifting every element after the removed item. Instead, the last element is moved into the removed element’s position. This takes constant time for the actual removal instead of requiring multiple elements to be shifted.

Phase 2
LinkedCollection has some advantages over ArrayCollection, but it also uses more memory. Each linked item needs a node that stores both the artifact and a reference to the next node. ArrayCollection only needs the array slots themselves, so it generally has less memory overhead.

ArrayCollection also has better cache locality because its elements are stored next to each other in memory. LinkedCollection nodes can be located in different areas of memory, which can make accessing them slower. However, LinkedCollection can grow dynamically without needing to resize an array, and adding an item at the front is O(1).
