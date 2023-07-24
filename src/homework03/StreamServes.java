package homework03;

import java.util.Collections;
import java.util.List;

public class StreamServes {
    public void sortSize (List<Stream> stream) {
        StreamComparator comparator = new StreamComparator();
        Collections.sort(stream, comparator);
    }
}
