# sql-dialect

An experimental sql dialect to tract indices

## Usage

Wrap all SQL statements in `sql-statement`

```clojure
(ns my.ns
  (:require [sql-dialect.core :refer [sql-statement]]))

(sql-statement "SELECT * from my_table WHERE my_table.my_column* = 1")
```

Fully qualified `my_table.my_column*` statements will be stripped to regular SQL and a list of columns collected so that the indices can be created with a call to `sql-dialect.core/create-indices!`.

## License

Copyright © 2018 Matthew Molloy

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
