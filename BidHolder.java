package negotiator.groupn;

import negotiator.Bid;

public class BidHolder implements Comparable<BidHolder> {
	Bid b;
	double v;
	@Override
	public int compareTo(BidHolder arg0) {
		return Double.compare(arg0.v,v);
	}
	
	@Override
	public boolean equals(Object obj) {
		return b.equals(((BidHolder)obj).b);
	}
}
