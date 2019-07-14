package edu.sabanciuniv.berry.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/rest/school")
@Api(value = "School Resource")
public class SchoolResource {

}
