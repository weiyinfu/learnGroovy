import java.nio.file.Files
import java.nio.file.Paths

Files.list(Paths.get(".")).forEach(x->{
    println(x.fileName)
})