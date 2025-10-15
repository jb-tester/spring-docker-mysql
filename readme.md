## Remote spring Debugger

1. run `mvn package`
2. run docker compose file
   (alternatively, run the saved Docker configuration that has the `mvn package` as "before run" task)
3. start the "remote debug" debug configuration
4. run the HTTP request from http-request.http file

Result:
debugger stops on the breakpoint inside the PersonService class
the SpringDebugger-specific evaluators are available
However, no Sprng-specific nodes/inlays/etc are available, properties evaluation fails, the bean classes are shown as not loaded in the Project view etc.


If instead of the special RC with use the AttachDebugger... inlay for the running docker configuration,
the Spring debugger is not available at all, though debug works