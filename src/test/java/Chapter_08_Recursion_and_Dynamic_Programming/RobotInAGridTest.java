package Chapter_08_Recursion_and_Dynamic_Programming;

import org.junit.jupiter.api.Test;

class RobotInAGridTest {

	boolean[][] getGrid(String... grid) {

		int colNum = grid[0].length();
		int rowNum = grid.length;

		boolean[][] result = new boolean[rowNum][colNum];

		for (int row = 0; row < rowNum; row++) {
			for (int col = 0; col < colNum; col++) {
				result[row][col] = grid[row].charAt(col) == ' ';
			}
		}

		return result;
	}

	String toString(boolean[][] grid, RobotInAGrid.PathResult pathResult) {
		StringBuilder sb = new StringBuilder();
		int colNum = grid[0].length;
		int rowNum = grid.length;
		char[][] buf = new char[rowNum][colNum];
		for (int row = 0; row < rowNum; row++) {
			for (int col = 0; col < colNum; col++) {
				if (!grid[row][col]) {
					buf[row][col] = '#';
				}
			}
		}
		{
			var path = pathResult.path;
			if (path != null) {
				for (var pos : path) {
					buf[pos.getRow()][pos.getCol()] = '*';
				}
			}
		}
		{
			var visited = pathResult.visited;
			if (visited != null) {
				for (var pos : visited) {
					buf[pos.getRow()][pos.getCol()] = '?';
				}
			}
		}

		for (int col = 0; col < colNum + 2; col++) {
			sb.append("-");
		}
		sb.append("\r\n");
		for (int row = 0; row < rowNum; row++) {
			sb.append("|");
			for (int col = 0; col < colNum; col++) {
				sb.append(buf[row][col]);
			}
			sb.append("|\r\n");
		}
		for (int col = 0; col < colNum + 2; col++) {
			sb.append("-");
		}
		sb.append("\r\n");

		return sb.toString();
	}

	@Test
	void testGetPath() {
		boolean[][] grid = getGrid(//
				"    x  x   ", //
				"xxx xx x   ", //
				"           ", //
				"       xx  ", //
				"       x   "//
		);

		var path = RobotInAGrid.getPath(grid);
		System.out.println("Path: " + path);
		System.out.println(toString(grid, path));
	}

}
