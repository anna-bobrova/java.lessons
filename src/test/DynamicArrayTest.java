import com.epam.bobrova_anna.lesson4.DynamicArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DynamicArrayTest {

    private DynamicArray<Integer> list;

    @Before
    public void createNewList() {
        list = new DynamicArray<Integer>();
    }

    @Test
    public void testAdd_SizeAfterAddObject() {
        list.add(1);
        list.add(2);
        Assert.assertTrue(list.size() == 2);
    }

    @Test
    public void testRemove_SizeAfterRemoveObject() {
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        list.remove(1);
        Assert.assertTrue(list.size() == 2);
    }

    @Test
    public void testListCreated_ListIsEmpty() {
        Assert.assertTrue(list.size() == 0);
    }

    @Test
    public void testGetObject_GetByIndex() {
        list.add(5);
        Assert.assertTrue(list.get(0) == 5);
    }

}
