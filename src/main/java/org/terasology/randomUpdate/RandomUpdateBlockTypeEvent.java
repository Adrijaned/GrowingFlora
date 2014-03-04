/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.randomUpdate;

import org.terasology.entitySystem.event.Event;
import org.terasology.math.Vector3i;

import java.util.Collection;

public class RandomUpdateBlockTypeEvent implements Event {
    private Collection<Vector3i> blockPositions;

    public RandomUpdateBlockTypeEvent(Collection<Vector3i> blockPositions) {
        this.blockPositions = blockPositions;
    }

    public Collection<Vector3i> getBlockPositions() {
        return blockPositions;
    }
}
