package staticFactoryBuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VipCustomerTest {

    @Test
    public void should_create_a_default_vip_customer() {
        //GIVEN
        String expectedEmailAddress = "default@email.com";
        String expectedName = "Default name";
        int expectedCreditLimit = 300000;

        // WHEN
        VipCustomer defaultVip = VipCustomer.createDefaultVipCustomer();

        //THEN
        assertEquals(defaultVip.getEmailAddress(), expectedEmailAddress);
        assertEquals(defaultVip.getName(), expectedName);
        assertEquals(defaultVip.getCreditLimit(), expectedCreditLimit);
    }

    @Test
    public void should_create_a_vip_customer_without_email() {
        //GIVEN
        String expectedEmailAddress = "default@email.com";
        String expectedName = "Ivan";
        int expectedCreditLimit = 1000;

        // WHEN
        VipCustomer defaultVip = VipCustomer.createVipCustomerWithoutEmail(expectedName,expectedCreditLimit);

        //THEN
        assertEquals(defaultVip.getEmailAddress(), expectedEmailAddress);
        assertEquals(defaultVip.getName(), expectedName);
        assertEquals(defaultVip.getCreditLimit(), expectedCreditLimit);
    }

    @Test
    public void should_create_a_vip_customer() {
        //GIVEN
        String expectedEmailAddress = "myemail@email.com";
        String expectedName = "Be";
        int expectedCreditLimit = 2000;

        // WHEN
        VipCustomer defaultVip = VipCustomer.createVipCustomer(expectedName, expectedCreditLimit, expectedEmailAddress);

        //THEN
        assertEquals(defaultVip.getEmailAddress(), expectedEmailAddress);
        assertEquals(defaultVip.getName(), expectedName);
        assertEquals(defaultVip.getCreditLimit(), expectedCreditLimit);
    }

    @Test
    public void should_create_a_vip_customer_with_builder() {
        //GIVEN
        String expectedEmailAddress = "myemail@email.com";
        String expectedName = "Be";
        int expectedCreditLimit = 2000;

        // WHEN
        VipCustomer buildVipCustomer = new VipCustomer.Builder(expectedName).withCreditLimit(expectedCreditLimit).withEmailAddress(expectedEmailAddress).build();

        //THEN
        assertEquals(buildVipCustomer.getEmailAddress(), expectedEmailAddress);
        assertEquals(buildVipCustomer.getName(), expectedName);
        assertEquals(buildVipCustomer.getCreditLimit(), expectedCreditLimit);
    }
}