package test.shamming.Dao;

import com.njau.repo.mapper.StaffMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StaffDaoTest {

    @Autowired
    StaffMapper staffMapper;
    @Test
    public void getViewTest() {
        //System.out.println(staffMapper.selectAll());

        System.out.println("hello");
    }
}
