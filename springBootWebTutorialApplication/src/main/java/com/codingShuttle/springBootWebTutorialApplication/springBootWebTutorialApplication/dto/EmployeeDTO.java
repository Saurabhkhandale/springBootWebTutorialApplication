package com.codingShuttle.springBootWebTutorialApplication.springBootWebTutorialApplication.dto;

import com.codingShuttle.springBootWebTutorialApplication.springBootWebTutorialApplication.annotation.EmployeeRoleValidation;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;
    @NotBlank(message = "Name of Employee cannot be blank")
    @Size(min = 3, max = 10, message = "Number of characters should be in the range: [3,10]")
    private String name;

    @NotBlank(message = "Email of Employee cannot be blank")
    @Email(message = "Email should be a valid email")
    private String email;
    @NotNull(message = "Age of employee cannot be null")
    @Max(value = 80, message = "Age cannot be greater than 80")
    @Min(value = 18, message = "Age of Employee cannot be less than 18")
    private Integer age;
    @NotBlank(message = "Role of employee cannot be blank")
    // @Pattern(regexp = "^(ADMIN|USER)$", message = "The role of employee can be USER OR ADMIN")
    @EmployeeRoleValidation
    private String role;    //ADMIN OR USER

    @NotNull(message = "Salary of Employee should be not null")
    @Positive(message = "Salary of Employee should be positive")
    @Digits(integer = 6, fraction = 2, message = "The salary can be in the form XXXXXX.YY")
    @DecimalMax(value = "100000.99")
    @DecimalMin(value = "100.50")
    private double salary;

    @PastOrPresent(message = "Date of joining field in employee cannot be in future")
    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    @AssertTrue(message = "Employee should be Active")
    private Boolean isActive;
}
