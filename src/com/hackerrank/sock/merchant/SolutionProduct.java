/*
 * ==============================================================================
 * (c) 2020
 * Fidelity National Information Services, Inc. and/or its subsidiaries - All 
 * Rights Reserved worldwide.
 * ---------------------------------------------------------------------------
 * This document is protected under the trade secret and copyright laws as the
 * property of Fidelity National Information Services, Inc. and/or its subsidiaries.
 * Copying, reproduction or distribution should be limited and only to employees
 * with a 'need to know' to do their job. Any disclosure of this document to
 * third parties is strictly prohibited.
 * =============================================================================
 */
package com.hackerrank.sock.merchant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class SolutionProduct
{
    private static final Scanner scanner = new Scanner(System.in);

    private static Map<String, Integer> topProductMap = new TreeMap<String, Integer>();

    public static void main(String[] args)
    {
        Map<String, Map<String, List<Product>>> listOfProducts = new TreeMap<String, Map<String, List<Product>>>();
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Map<String, List<Product>> topProducts = new TreeMap<String, List<Product>>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < t; i++)
        {
            int c = Integer.parseInt(scanner.nextLine());
            listOfProducts.put("case-" + i, topProducts);
            List<Product> products = new ArrayList<SolutionProduct.Product>();
            int top = 1;
            while (c > 0)
            {
                String[] arrStrings = scanner.nextLine().split(" ");
                if (arrStrings[0].equals("top"))
                {
                    topProducts.put("top-" + top, products);
                    top++;
                    products = new ArrayList<SolutionProduct.Product>();
                }
                else
                {
                    products.add(new Product(arrStrings[0], Integer.parseInt(arrStrings[1]), ""));
                }
                c--;

            }
            topProducts = new TreeMap<String, List<Product>>();
        }
        findTopProducts(listOfProducts);
        listOfProducts.clear();
        topProducts.clear();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Processed time: " + TimeUnit.MILLISECONDS.toSeconds(duration) + " " + TimeUnit.SECONDS);

    }

    private static void findTopProducts(Map<String, Map<String, List<Product>>> productsCaseMap)
    {
        for (Entry<String, Map<String, List<Product>>> productMapEntry : productsCaseMap.entrySet())
        {
            printTopProducts(productMapEntry.getValue());
            productMapEntry.getValue().clear();
        }
        topProductMap.clear();
    }

    private static void printTopProducts(Map<String, List<Product>> productsMap)
    {
        int size = productsMap.size();
        if (size == 1)
        {
            onlyOneTopProducts(productsMap);

        }
        else
        {
            testCaseHasMoreTopProducts(productsMap, size);
        }

    }

    /**
     * This is responsible for when testcase has more than one top products
     *
     * @param productsMap
     * @param size
     */
    private static void testCaseHasMoreTopProducts(Map<String, List<Product>> productsMap, int size)
    {
        for (int i = 1; i <= size; i++)
        {
            final List<Product> products = productsMap.get("top-" + i);
            addAllProducts(products);
            displayTopProducts(products);

        }

    }

    private static void displayTopProducts(List<Product> products)
    {
        Set<Integer> productUnits = new HashSet<Integer>(topProductMap.values());
        boolean allEqual = productUnits.size() == 1;
        StringBuilder partialTie = new StringBuilder();
        boolean isPartialTie = checkPartialTieInProducts(partialTie);
        if (!allEqual && !isPartialTie)
        {
            LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
            topProductMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> linkedHashMap.put(x.getKey(), x.getValue()));
            System.out.println(linkedHashMap.keySet().iterator().next());
        }
        else if (allEqual)
        {
            printProductNamesFromMap(topProductMap.keySet());

        }
        else if (isPartialTie)
        {
            System.out.println(partialTie);
        }

    }

    private static void sortByAscendingOrder(List<Product> products)
    {
        Collections.sort(products, Collections.reverseOrder());

    }

    /**
     * If only one top products, then not required to iterate
     *
     * @param productsMap
     */
    private static void onlyOneTopProducts(Map<String, List<Product>> productsMap)
    {
        List<Product> products = productsMap.get("top-1");
        topProductMap.clear();
        addAllProducts(products);
        displayTopProducts(products);

    }

    /**
     * Check if any product partial match with other product which is maximum count
     *
     * @param partialTie
     * @return
     */
    private static boolean checkPartialTieInProducts(StringBuilder partialTie)
    {
        //Integer item = topProductMap.entrySet().iterator().next().getValue();
        List<Integer> values = topProductMap.values().stream().collect(Collectors.toList());
        Collections.sort(values, Collections.reverseOrder());
        Integer item = values.get(0);
        topProductMap.forEach((k, v) -> {
            if (item.equals(v))
            {
                if (partialTie.length() == 0)
                {
                    partialTie.append(k);
                }
                else
                {
                    partialTie.append(" ").append(k);
                }
            }
        });
        return partialTie.length() == 0 ? false : true;

    }

    private static void printProductNamesFromMap(Set<String> keySet)
    {
        int i = 0;
        for (String productName : keySet)
        {
            System.out.print(keySet.size() == i ? productName : productName + " ");
            i++;
        }
        System.out.println();
    }

    /**
     * Add all products onto global treeMap
     *
     * @param products
     */
    private static void addAllProducts(List<Product> products)
    {
        for (Product product : products)
        {
            Integer val = topProductMap.get(product.getProductName());
            if (val != null)
            {
                topProductMap.put(product.getProductName(), product.getProuctUnit() + val);
            }
            else
            {
                topProductMap.put(product.getProductName(), product.getProuctUnit());
            }
        }

    }

    static class Product implements Comparable<Product>
    {
        private String productName;

        private int prouctUnit;

        private String productTop;

        /**
         * @param productName
         * @param prouctUnit
         * @param productTop
         */
        public Product(String productName, int prouctUnit, String productTop)
        {
            this.productName = productName;
            this.prouctUnit = prouctUnit;
            this.productTop = productTop;
        }

        /**
         * @return the productName
         */
        public String getProductName()
        {
            return productName;
        }

        /**
         * @param productName the productName to set
         */
        public void setProductName(String productName)
        {
            this.productName = productName;
        }

        /**
         * @return the prouctUnit
         */
        public int getProuctUnit()
        {
            return prouctUnit;
        }

        /**
         * @param prouctUnit the prouctUnit to set
         */
        public void setProuctUnit(int prouctUnit)
        {
            this.prouctUnit = prouctUnit;
        }

        /**
         * @return the productTop
         */
        public String getProductTop()
        {
            return productTop;
        }

        /**
         * @param productTop the productTop to set
         */
        public void setProductTop(String productTop)
        {
            this.productTop = productTop;
        }

        @Override
        public int compareTo(Product o)
        {
            int sale = this.prouctUnit > o.prouctUnit ? 1 : this.prouctUnit < o.prouctUnit ? -1 : 0;
            return sale == 0 ? this.productName.compareTo(o.productName) : sale;
        }

    }
}
