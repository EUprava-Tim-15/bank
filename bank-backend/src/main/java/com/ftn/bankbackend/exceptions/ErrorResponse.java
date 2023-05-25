package com.ftn.bankbackend.exceptions;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class ErrorResponse {
    @NonNull
    private final int status;
    @NonNull
    private final String message;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> errors;
}
