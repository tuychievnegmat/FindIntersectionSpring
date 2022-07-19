package com.coderbyte.FindIntersectionSpring;

import com.coderbyte.FindIntersectionSpring.model.FindIntersection;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/*All tests in the class FindIntersectionSpringApplicationTests*/
@SpringBootTest
class FindIntersectionSpringApplicationTests {

	@Test
	void testFirst() {
		String[] strArr = new String[2];
		strArr[0] = "1, 3, 4 ,7 , 13";
		strArr[1] = "1, 2, 4, 13, 15";
		Assert.assertEquals("1,4,13", FindIntersection.findIntersection(strArr));
	}

	@Test
	void testSecond(){
		String[]strArr2 = new String[2];
		strArr2[0] = "1, 3, 9, 10, 17, 18";
		strArr2[1] = "1, 4, 9, 10";

		Assert.assertEquals("1,9,10", FindIntersection.findIntersection(strArr2));
	}

	@Test
	void testEmpty(){
		String[] strArr3 = new String[2];
		strArr3[0] = "1, 2, 3, 4, 5";
		strArr3[1] = "6, 7, 8, 9, 10";

		Assert.assertEquals("EMPTY", FindIntersection.findIntersection(strArr3));
	}

}
