
public class Chapter1Question7 {

	/**
	 * <em>Rotate Matrix:</em> Given an image represented by an NxN matrix, where
	 * each pixel in the image is 4 bytes, write a method to rotate the image by 90
	 * degrees. Can you do this in place?
	 * 
	 * @param matrix the matrix (the matrix is mutated in-place, but also returned)
	 * @return the rotated matrix
	 */
	public static int[][] rotateMatrix(int[][] matrix) {

		int dimension = matrix.length;

		// go trough each layer from the outside to inside
		for (int layer = 0; layer < dimension / 2; layer++) {
		
			int first = layer;
			
			int last = dimension - 1 - layer;
			
			// inside the layer, go from first element to last
			for (int i = first; i < last; i++) {
				
				int offset = i - first;
				
				// save top
				int top = matrix[first][i]; 
				
				// left -> top
				matrix[first][i] = matrix[last - offset][first];
				
				// bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];
				
				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];
				
				// top -> right
				matrix[i][last] = top; // right<- saved top

			}
		}
		return matrix;
	}
}
