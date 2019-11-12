# clj-telnet

A simple clojure telnet client

## Usage

## Example
### Assuming you're in a repl (`lein repl`)...

Import the core namespace:

`(use 'clj-telnet.core)`

Create a telnet object (Don't forget to close when finished)

`(def telnet (get-telnet url port))`

Now you can read and write from that object.

Read buffer until some-string:

`(read-until telnet some-string)`

Send command to telnet server:

`(write telnet some-command)`

Read everything from the buffer (don't use in production)

`(read-all telnet)`

Close the telnet connection

`(kill-telnet telnet)`
