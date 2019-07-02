package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	   int buckets =  getBucketCount(3.4, 1.5);
        System.out.println(buckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if(width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0){
            double areaToPaint = height*width;
            double paintableArea = extraBuckets * areaPerBucket;
            double areaLeft = areaToPaint-paintableArea;
            double bucketsNeeded = areaLeft/areaPerBucket;


            return (int)Math.ceil(bucketsNeeded);
        }

        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if(width > 0 && height > 0 && areaPerBucket > 0){
            double areaToPaint = height*width;
            double bucketsNeeded = areaToPaint/areaPerBucket;


            return (int)Math.ceil(bucketsNeeded);
        }

        return -1;
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if(area > 0 && areaPerBucket > 0){
            double areaLeft = area / areaPerBucket;
            double numberOfBuckets = Math.ceil(areaLeft);
            return (int)numberOfBuckets;
        }

        return -1;
    }

}
