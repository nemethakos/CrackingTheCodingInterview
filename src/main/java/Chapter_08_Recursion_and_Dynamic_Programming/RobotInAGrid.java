package Chapter_08_Recursion_and_Dynamic_Programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <b>Robot in a Grid:</b> Imagine a robot sitting on the upper left corner of
 * grid with r rows and c columns. The robot can only move in two directions,
 * right and down, but certain cells are "off limits" such that the robot cannot
 * step on them. Design an algorithm to find a path for the robot from the top
 * left to the bottom right.
 *
 */
public class RobotInAGrid {

	/**
	 * Front method for finding the path from (0,0) to the bottom right corner of
	 * the grid.
	 * 
	 * @param grid the array of cells, where false value means blocked cell.
	 * @return null, if there is no path or the {@link PathResult} containing the
	 *         path and the visited cells (from where no path exists to the
	 *         destination)
	 */
	public static PathResult getPath(boolean[][] grid) {
		if (grid == null || grid.length == 0) {
			return null;
		}

		List<Pos> path = new ArrayList<>();
		Set<Pos> visited = new HashSet<>();

		if (getPath(grid, 0, 0, path, visited)) {
			return new PathResult(path, new ArrayList<Pos>(visited));
		}

		return null;
	}

	/**
	 * Recursive method to find a path to right-left corner of grid. Start position
	 * is (row,col). path contains the list of coordinates after the method returns
	 * true (in reverse). visited contains the already visited coordinates.
	 * 
	 * @param grid    the boolean array describing the grid. false value means
	 *                blocked cell.
	 * @param row     row of the start coordinate
	 * @param col     column of the start coordinate
	 * @param path    the positions of the so far visited cells.
	 * @param visited the cells which are "dead ends"
	 * @return true, if the destination is found, or the path exists from the
	 *         (row,col) position to the destination.
	 */
	private static boolean getPath(boolean[][] grid, int row, int col, List<Pos> path, Set<Pos> visited) {
		Pos pos = new Pos(row, col);

		// check if the (row,col) is invalid
		if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || !grid[row][col]
				|| visited.contains(pos)) {
			System.out.println(pos + " -> invalid");
			return false;
		} else {
			System.out.println(pos);
		}

		// true if the position is the final destination
		boolean arrived = row == grid.length - 1 && col == grid[0].length - 1;

		// after a successful step, the position is added to the path
		if (arrived || getPath(grid, row + 1, col, path, visited) || getPath(grid, row, col + 1, path, visited)) {
			path.add(pos);
			System.out.println(path);
			return true;
		}

		// unsuccessful steps are added to the visited list
		visited.add(pos);

		return false;
	}

	/**
	 * Contains the path from (0,0) to bottom right corner and the cells from where
	 * no path exists to the bottom right cell.
	 */
	public static class PathResult {
		List<Pos> path;
		List<Pos> visited;

		public PathResult(List<Pos> path, List<Pos> visited) {
			super();
			this.path = path;
			this.visited = visited;
		}

		@Override
		public String toString() {
			return String.format("PathResult [path=%s, visited=%s]", path, visited);
		}
	}

	/**
	 * Coordinate pair (row,col)
	 */
	public static class Pos {
		private int col;
		private int row;

		public Pos(int row, int col) {
			this.row = row;
			this.col = col;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pos other = (Pos) obj;
			if (col != other.col)
				return false;
			if (row != other.row)
				return false;
			return true;
		}

		public int getCol() {
			return col;
		}

		public int getRow() {
			return row;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + col;
			result = prime * result + row;
			return result;
		}

		@Override
		public String toString() {
			return String.format("%s,%s", row, col);
		}

	}

}
