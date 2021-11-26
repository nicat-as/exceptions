package az.developia.exceptions.custom;

import java.util.StringJoiner;
import java.util.UUID;

public class BaseException extends RuntimeException {
    private String exId;
    private String exCode;

    public BaseException(String exCode, String exMessage) {
        super(exMessage);
        this.exId = UUID.randomUUID().toString();
        this.exCode = exCode;
    }

    public String getExId() {
        return exId;
    }

    public String getExCode() {
        return exCode;
    }



    @Override
    public String toString() {
        return new StringJoiner(", ", BaseException.class.getSimpleName() + "[", "]")
                .add("exId='" + exId + "'")
                .add("exCode='" + exCode + "'")
                .add("exMessage='" + super.getMessage() + "'")
                .toString();
    }
}
