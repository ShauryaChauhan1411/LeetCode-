class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        boolean ans = false;
        int x = xCenter, y = yCenter;

        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            ans = true;
        }

        if (y <= y2 && y >= y1 && (x + radius >= x1 && x - radius <= x2)) {
            ans = true;
        }

        if (x <= x2 && x >= x1 && (y + radius >= y1 && y - radius <= y2)) {
            ans = true;
        }

        if ((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y) <= radius * radius) {
            ans = true;
        }
        if ((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y) <= radius * radius) {
            ans = true;
        }
        if ((x1 - x) * (x1 - x) + (y2 - y) * (y2 - y) <= radius * radius) {
            ans = true;
        }
        if ((x2 - x) * (x2 - x) + (y1 - y) * (y1 - y) <= radius * radius) {
            ans = true;
        }

        return ans;
    }
}