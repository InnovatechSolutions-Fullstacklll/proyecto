package com.Inovatech.ms_proyectos.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecurityConfigTest {

    @Test
    void securityConfigCreationTest() {

        SecurityConfig config =
                new SecurityConfig();

        assertNotNull(config);
    }
}