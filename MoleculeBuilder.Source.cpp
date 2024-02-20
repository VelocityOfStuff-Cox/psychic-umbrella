/*
* Programmer: <|VelocityOfStuff|>
* Version: <|1.0|>
* Since: <|10/12/2023|>
*/

#include <iostream>
#include <vector>
#include <string>

enum MolecularBond {Covalent, Ionic, Metallic, HydrogenBonding, VanDerWaals};

struct Atom 
{
    float weight;
    std::string name;
    std::string abbreviation;
    int atomicNumber;
};

struct Molecule
{
    MolecularBond bond;
    std::vector<Atom> atoms;
};

int main()
{
    std::vector<Molecule> molecules;
    
    for (int i{0}; i < 3; i++)
    {
        molecules.push_back(Molecule());
        
        std::cout << "Please input the number of atoms" << std::endl;
        
        int numAtoms{};
        std::cin >> numAtoms;
        
        for (int j{0}; j < numAtoms; j++)
        {
            atoms.push_back(Atom());
            
            std::cout << "please provide the following \n"
            << "Weight: \n"
            << "Name: \n"
            << "Abbreviation: \n"
            << "Atomic Number: " << std::endl;
            
            std::cin << atoms.back.weight;
            std::cin << atoms.back.name;
            std::cin << atoms.back.abbreviation;
            std::cin << atoms.back.atomicNumber;
            
        }
        
        std::cout << "What type of bond is it: \n" 
        << "\t1. Covalent"
        << "\t2. Ionic"
        << "\t3. Metallic"
        << "\t4. Hydrogen Bonding"
        << "\t5. VanDerWaals"
        << std::endl;
        
        switch 
        {
            case 1: 
            {
                molecules.back.bond = Covalent;
                break;
            }
            case 2: 
            {
                molecules.back.bond = Ionic;
                break;
            }
            case 3: 
            {
                molecules.back.bond = Metallic;
                break;
            }
            case 4: 
            {
                molecules.back.bond = HydrogenBonding;
                break;
            }
            case 5: 
            {
                molecules.back.bond = VanDerWaals;
                break;
            }
            default :
            {
                break;
            }
        }
        
    }
}
