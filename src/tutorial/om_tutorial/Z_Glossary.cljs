(ns om-tutorial.Z-Glossary
  (:require-macros
    [cljs.test :refer [is]]
    )
  (:require [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]
            [devcards.core :as dc :refer-macros [defcard defcard-doc]]
            ))

(defcard-doc
  "# Glossary of Terms

  - `Default database format`: A tree of data where all of the objects that have an ident are replaced by that ident, and
    the actual data of those objects is moved to top-level Om-owned tables. See `om/tree->db`.
  - `Ident`: A unique identity, represented as a 2-tuple `vector` with a first element keyword. An ident need only
    be client unique, but will often be based on real server-persisted data. Examples might be `[:people/by-id 3]`
    and `[:ui.button/by-id 42]`. Om can use these to find components that share state and should update together,
    and for other things like parse optimization.
  - `Stateless Component`: A component defined by `defui` that has no query. Such components must not change the structure
  of the incoming props (they must pass them down without removing structure).
  ")
