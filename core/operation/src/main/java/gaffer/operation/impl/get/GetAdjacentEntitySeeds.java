/*
 * Copyright 2016 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gaffer.operation.impl.get;

import gaffer.commonutil.iterable.CloseableIterable;
import gaffer.data.elementdefinition.view.View;
import gaffer.operation.AbstractGetIterableElementsOperation;
import gaffer.operation.GetIterableElementsOperation;
import gaffer.operation.data.EntitySeed;

/**
 * An <code>GetAdjacentEntitySeeds</code> operation will return the
 * {@link gaffer.operation.data.EntitySeed}s at the opposite end of connected edges to a seed
 * {@link gaffer.operation.data.EntitySeed}.
 * Seed matching is always RELATED.
 *
 * @see gaffer.operation.impl.get.GetAdjacentEntitySeeds.Builder
 * @see gaffer.operation.GetOperation
 */
public class GetAdjacentEntitySeeds extends AbstractGetIterableElementsOperation<EntitySeed, EntitySeed> {
    public GetAdjacentEntitySeeds() {
    }

    public GetAdjacentEntitySeeds(final Iterable<EntitySeed> seeds) {
        super(seeds);
    }

    public GetAdjacentEntitySeeds(final CloseableIterable<EntitySeed> seeds) {
        super(seeds);
    }

    public GetAdjacentEntitySeeds(final View view) {
        super(view);
    }

    public GetAdjacentEntitySeeds(final View view, final Iterable<EntitySeed> seeds) {
        super(view, seeds);
    }

    public GetAdjacentEntitySeeds(final View view, final CloseableIterable<EntitySeed> seeds) {
        super(view, seeds);
    }

    public GetAdjacentEntitySeeds(final GetIterableElementsOperation<EntitySeed, ?> operation) {
        super(operation);
    }

    @Override
    public SeedMatchingType getSeedMatching() {
        return SeedMatchingType.RELATED;
    }
    public abstract static class BaseBuilder<CHILD_CLASS extends BaseBuilder<?>>
            extends AbstractGetIterableElementsOperation.BaseBuilder<GetAdjacentEntitySeeds, EntitySeed, EntitySeed, CHILD_CLASS> {
        public BaseBuilder() {
            super(new GetAdjacentEntitySeeds());
        }
    }

    public static final class Builder extends BaseBuilder<Builder> {
        @Override
        protected Builder self() {
            return this;
        }
    }
}
