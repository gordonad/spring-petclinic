package org.springframework.samples.petclinic.repository.jpa;

import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.repository.AbstractVetRepositoryTests;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p> Integration tests for the {@link JdbcClinicImpl} implementation. </p> <p> </p>
 *
 * @author Thomas Risberg
 * @author Michael Isvy
 */
@ContextConfiguration(locations = {"classpath:spring/dao-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("jpa")
public class JpaVetRepositoryImplTests extends AbstractVetRepositoryTests {


}
