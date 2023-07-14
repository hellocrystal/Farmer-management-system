package test.shamming.comtroller;

import com.njau.service.ComplainService;
import com.njau.util.DateTimeUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;

@SpringBootTest
public class ComplainControllerTest {

    @Autowired
    ComplainService complainService;

}
