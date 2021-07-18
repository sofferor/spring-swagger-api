package com.example.springswaggerapi;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
//@Tag(name = "Custom service entity", description = "The custom API with description tag annotation")
@ApiModel(value = "Custom service", description = "The custom API with description")
public class CustomController {

    @RequestMapping(value = "/custom", method = RequestMethod.POST)
    @ApiOperation(value = "custom API description", notes = "notes for more details", response = String.class)
    public String custom(@ApiParam(value = "Name for getting it back", required = true) @RequestParam String name) {
        return "Got your name: " + name;
    }
}
