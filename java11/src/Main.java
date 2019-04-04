import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.lang.ProcessHandle;

public class Main {

    public static void main(String[] args) throws URISyntaxException {

        //
        java.lang.ProcessHandle self = java.lang.ProcessHandle.current();
        long PID = self.pid();
        ProcessHandle.Info procInfo = self.info();
        //Optional<String[]> args = procInfo.arguments();
        Optional<String> cmd = procInfo.commandLine();
        Optional<Instant> startTime = procInfo.startInstant();
        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();
        System.out.println(procInfo);

    }
}
