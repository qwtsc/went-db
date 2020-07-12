package io.qwtsc.h2db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author qwtsc
 */
@Service
public interface PhysicalPropertiesRepository extends JpaRepository<Property, String> {
}
