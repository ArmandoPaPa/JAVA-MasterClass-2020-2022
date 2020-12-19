public class PaintJob {

    public static int getBucketCount(double width, double height,
                                     double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double areaToPaint = width * height;
            double areaLeftOver = areaToPaint - areaPerBucket * extraBuckets;
            return (int) Math.ceil((double) (areaLeftOver / areaPerBucket));
        }
    }

    public static int getBucketCount(double width, double height,
                                     double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double areaToPaint = width * height;
            return (int) Math.ceil((double) (areaToPaint / areaPerBucket));
        }
    }

    public static int getBucketCount(double area,
                                     double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int) Math.ceil((double) (area / areaPerBucket));
        }
    }

}
