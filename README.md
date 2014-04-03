# lein-jnaerator

A Leiningen plugin that very minimally wraps JNAerator. The purpose of this is to allow Leiningen-based projects to use JNAerator in a managed way (i.e. allowing lein to set up dependencies/paths; be explicit about versions; use jnaerator as a task; etc).

## Usage

Put `[lein-jnaerator "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

Invoke with the `run` subtask to pass directly through to the JNAerator CLI:

    $ lein jnaerator run --help

All of JNAerator's arguments are therefore supported. In order to persist configuration, use JNAerator's `@file` argument form.

## License

Copyright © 2014 SMX

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
