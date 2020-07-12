package io.qwtsc.h2db;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author qwtsc
 */
@RestController
@RequestMapping("/data")
public class PropertyController {
    private PhysicalPropertiesRepository physicalPropertiesRepository;

    public PropertyController(PhysicalPropertiesRepository physicalPropertiesRepository) {
        this.physicalPropertiesRepository = physicalPropertiesRepository;
    }

    @GetMapping(value = "/{id}")
    public Property getPropertiesFromId(@PathVariable("id") String id){
        Optional<Property> res = physicalPropertiesRepository.findById(id);
        return res.orElse(null);
    }

    @GetMapping("/all")
    public List<Property> getAllProperties() {
        List<Property> res = physicalPropertiesRepository.findAll();
        return res;
    }
}
