# CollectionsFactory
CollectionsFactory allows programs to share the same source code but use different collections based on the specific needs of the application.

### Example Scenario
An applications is deployed to both mobile and desktop platforms.
- Mobile devices often do not have enough storage space for custom complex collection implementations and CollectionsFactory will use the built in collections.
- The desktop devices can afford the extra storage cost in return for better collection implementations and faster performance and CollectionsFactory will use something like [fastutil](https://github.com/vigna/fastutil) instead.

### Usage
1. If you intend to use custom collections, register your custom `CollectionsProvider` when your program launches with this: `CollectionsFactory.registerProvider(provider);`
2. Every time you need a new collection, use `CollectionsFactory.new` + whatever collection type you need.

### Note
- You do not need to register a custom collections provider if you intend to use the built in collections, CollectionsFactory will automatically fall back.
- `Collections.class` is a mirror of `CollectionsFactory.class`, use it if you wish to avoid excessive typing.