import io.vavr.API;
import io.vavr.Tuple2;
import io.vavr.collection.Map;
import org.junit.Test;

import static io.vavr.API.Tuple;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by kevin on 31/05/2017 for issuevavraboutmap
 */
public class MapTest {

    @Test
    public void should_have_a_map_from_entries() {
        /* GIVEN */
        Tuple2<Integer, String> t1 = Tuple(1, "foo");
        Tuple2<Integer, String> t2 = Tuple(2, "foo");
        Tuple2<Integer, String> t3 = Tuple(3, "foo");
        Tuple2<Integer, String> t4 = Tuple(4, "foo");

        /* WHEN  */
        Map<Integer, String> map = API.<Integer, String>Map(t1, t2, t3, t4);

        /* THEN  */
        assertThat(map).hasSize(4);
    }

}
