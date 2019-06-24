package pengming.xu.wxBook.sao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WxApiSaoTest {

    @Autowired
    private WxApiSao wxApiSao;

    @Test
    public void getOpenIdByCode(){
        wxApiSao.getOpenIdByCode("123","123","123");
    }

}