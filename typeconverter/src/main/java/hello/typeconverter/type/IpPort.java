package hello.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

// "127.0.0.0.1:8080"의 문자 url이 들어오면 IpPort객체로 바꾼다.
@Getter
@EqualsAndHashCode // equals와 hashCode 메소드를 자동으로 생성
public class IpPort {

    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
