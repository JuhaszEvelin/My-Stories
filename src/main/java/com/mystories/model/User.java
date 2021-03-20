package com.mystories.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

//Auto-configuration is always applied after user-defined beans have been registered.
@EnableAutoConfiguration(excludeName = {"multipartResolver","mbeanServer"})
public class User {
}
