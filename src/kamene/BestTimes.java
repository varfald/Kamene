package kamene;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;



public class BestTimes implements Iterable<BestTimes.PlayerTime> {
	
		
		private List<PlayerTime> playerTimes = new ArrayList<PlayerTime>();
		Formatter f = new Formatter();

		
		public Iterator<PlayerTime> iterator() {
			return playerTimes.iterator();
		}

		
		public void addPlayerTime(String name, int time) {
			playerTimes.add(new PlayerTime(name, time));
			Collections.sort(playerTimes);

		}

		public String toString() {
			Iterator<PlayerTime> iterator = iterator();
			while (iterator.hasNext()) {
				PlayerTime pt = iterator.next();
				f.format("%d. %s",playerTimes.add(pt));

			}
			return f.toString();

		}
		
		public void reset() {
			playerTimes.clear();
		}

		
		public static class PlayerTime implements Comparable<PlayerTime> {

			public String getName() {
				return name;
			}

			public int getTime() {
				return time;
			}

			
			private final String name;

			
			private final int time;

			
			public PlayerTime(String name, int time) {
				this.name = name;
				this.time = time;
			}

			@Override
			public int compareTo(PlayerTime o) {
				return time;
			}
			
		}
	}



