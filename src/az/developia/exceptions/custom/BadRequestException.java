package az.developia.exceptions.custom;

import java.util.StringJoiner;

public class BadRequestException extends BaseException {
    private static final String CODE = "exception.bad-request";

    public BadRequestException(String exMessage) {
        super(CODE, exMessage);
    }

    public BadRequestException(String exCode, String exMessage) {
        super(exCode, exMessage);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BadRequestException.class.getSimpleName() + "[", "]")
                .add(super.toString())
                .toString();
    }
}


