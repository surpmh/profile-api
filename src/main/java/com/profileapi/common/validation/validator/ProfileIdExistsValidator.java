package com.profileapi.common.validation.validator;

import com.profileapi.adapter.out.persistence.repository.ProfileJpaRepository;
import com.profileapi.common.validation.annotation.ProfileIdExists;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ProfileIdExistsValidator
        implements ConstraintValidator<ProfileIdExists, Long> {

    @Autowired
    private ProfileJpaRepository profileJpaRepository;

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        return value != null && profileJpaRepository.existsById(value);
    }
}
