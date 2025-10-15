package com.example.springdockermysql;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
class SomeProfileSpecificService {

}
