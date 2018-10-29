package com.spring.boot.profiling.utils;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import java.util.List;

public class AWSUtility {
    public static void main(String[] args)
    {
        String bucket_name = "bucket";
        System.out.format("Objects in S3 bucket %s:\n", bucket_name);
        String accesskey="accesskey";
        String secretKey="secretKey";

        final AmazonS3 s3 = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accesskey,secretKey)))
                .withRegion(Regions.US_EAST_1)
                .build();

        ListObjectsV2Result result = s3.listObjectsV2(bucket_name);
        List<S3ObjectSummary> objects = result.getObjectSummaries();
        for (S3ObjectSummary os: objects) {
            System.out.println("* " + os.getKey());
        }
    }
}