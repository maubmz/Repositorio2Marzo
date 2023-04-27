
 export interface Product{
    description: string;
    price: number;
}

/*const phone: Product = {
    description: "Nokia A1",
    price: 150.0
}

const tablet: Product = {
    description: "iPad Air",
    price: 250.0
}*/

interface TaxCalculationOptions{
    tax: number;
    products: Product[];

}

//function taxCalculation({tax, products}: TaxCalculationOptions): [Total:number,Tax:number]{
export function taxCalculation(options: TaxCalculationOptions): [Total:number,Tax:number]{

    const {tax,products} = options;
    let total = 0;

    products.forEach( ({price})=> {
        total += price 
    })

    return [total, total * tax]
}

/*const taxCalculationVar: TaxCalculationOptions ={
    tax: 0.15,
    products: [phone, tablet] 
}

const [total, taxTotal] = taxCalculation(taxCalculationVar);

console.log("Total: ", total );
console.log("Tax", taxTotal);*/


