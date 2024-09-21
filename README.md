# User Onboarding Process Framework

This project provides a flexible and reusable framework for managing a sequence of onboarding steps. The framework is designed to allow easy configuration of onboarding processes with minimal changes, ensuring loose coupling and high cohesion.

## Features

- **Abstraction at Process Level**: Define a process as a sequence of steps.
- **Step Abstraction**: Implement custom steps using a defined interface.
- **Context Class**: Pass data between steps in a flexible and type-agnostic way.
- **Configurable Processes**: Easily add or remove steps as required for different onboarding scenarios.
- **Reusable Framework**: New steps can be integrated with minimal changes.

## Components

### Interfaces

- **Process**: Represents a sequence of steps.
- **ProcessStep**: Defines the methods for executing a step and retrieving its name.

### Classes

- **Context**: A data holder that facilitates communication between steps.
- **UserOnboardingProcess**: Manages the execution of the onboarding steps.

### Step Implementations

- **MobileOnboardingStep**: Handles user onboarding via mobile.
- **EmailOnboardingStep**: Handles user onboarding via email.
- **CredentialVerificationStep**: Verifies user credentials (can be parameterized for different types).
- **AccountExistenceVerificationStep**: Checks if the user's account exists.

## Getting Started

### Prerequisites

- Java 8 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/akshay-sadavarte/UserOnboardingProcessFramework.git
   cd user-onboarding-process
