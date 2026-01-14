package org.example.ijse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestOne implements DI{


/*    //property injection
    @Autowired
    TestAgreement  testAgreement;

    public void chatWithTestTwo(){
        testAgreement.chat();
    }*/

/*    //constructor injection
    TestAgreement testAgreement;

//    @Autowired
//    public TestOne(TestAgreement testAgreement) {
//        this.testAgreement=testAgreement;
//    }

    public TestOne(TestAgreement testAgreement) {
        this.testAgreement = testAgreement;
    }

    public void chatWithTestTwo() {
        testAgreement.chat();
    }*/

    //setter method through injection
 /*   TestAgreement testAgreement;

    @Autowired
    public void setter(TestAgreement testAgreement) {
        this.testAgreement = testAgreement;
    }
    public void chatWithTestTwo() {
        testAgreement.chat();
    }*/

    //Interface Through Injection
    TestAgreement testAgreement;
    @Autowired
    @Override
    public void inject(TestAgreement agreement) {
        this.testAgreement = agreement;
    }
    public void chatWithTestTwo() {
        testAgreement.chat();
    }

}
