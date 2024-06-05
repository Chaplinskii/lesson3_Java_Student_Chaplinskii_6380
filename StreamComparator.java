import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream stream, Stream t1) {
        return stream.getStream_().size()-t1.getStream_().size();
    }
}
