package homework03;

import java.util.Comparator;
import java.util.List;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        int size1 = o1.getListGroup().size();
        int size2 = o2.getListGroup().size();
        return Integer.compare(size1, size2);
    }
}
